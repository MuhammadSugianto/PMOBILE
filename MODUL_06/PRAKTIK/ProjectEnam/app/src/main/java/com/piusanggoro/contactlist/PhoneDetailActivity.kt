package com.piusanggoro.contactlist

import `com piusanggoro`.contactlist.R
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_detail.*

class PhoneDetailActivity : AppCompatActivity() {

    override fun oncreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)

        var intentThatstartedThisActivity = getIntent()

        if (intentThatstartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partId = intentThatstartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            tv_item_id.text = partId
        }
    }
}