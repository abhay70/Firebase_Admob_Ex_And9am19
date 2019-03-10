package cubex.mahesh.firebase_admob_ex_and9am19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var   mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-6232583571965519/5752705505"
        mInterstitialAd.loadAd(AdRequest.Builder().build())

        var mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this)
        mRewardedVideoAd.loadAd("ca-app-pub-6232583571965519/8150803985",
            AdRequest.Builder().build())

        banner.setOnClickListener {
            val adRequest = AdRequest.Builder().build()
            adView.loadAd(adRequest)
        }
        interestial.setOnClickListener {

            mInterstitialAd.show()
        }
        video.setOnClickListener {

            mRewardedVideoAd.show()
        }
    }
}
