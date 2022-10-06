package com.example.prateekthakur

import android.content.Intent
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "About Me"

        val myProjects: Button = findViewById(R.id.my_projects)
        val myAchivements: Button = findViewById(R.id.achivements)
        val githubButton:ImageView = findViewById(R.id.github_profile)
        val instagramButton:ImageView = findViewById(R.id.instagram_profile)
        val linkedinButton:ImageView = findViewById(R.id.linkedin_profile)
        val mailButton:ImageView = findViewById(R.id.email)

        val projectActivity:Intent = Intent(this,MyProjects::class.java)
        val achivementsActivity:Intent = Intent(this,Achivements::class.java)

        myProjects.setOnClickListener{
            startActivity(projectActivity)
        }
        myAchivements.setOnClickListener {
            startActivity(achivementsActivity)
        }
        githubButton.setOnClickListener {
            openUrl("https://github.com/prateekthakur272/")
        }
        instagramButton.setOnClickListener {
            openUrl("https://www.instagram.com/prateek_._thakur/")
        }
        linkedinButton.setOnClickListener {
            openUrl("https://www.linkedin.com/in/prateek-thakur-452127216/")
        }
        mailButton.setOnClickListener {
            val mailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "prateekthakur272@gmail.com", null))
            startActivity(mailIntent)
        }
    }
    private fun openUrl(url:String):Unit{
        val uriUrl:Uri = Uri.parse(url)
        val launchBrowser:Intent = Intent(Intent.ACTION_VIEW, uriUrl)
        startActivity(launchBrowser)
    }
}