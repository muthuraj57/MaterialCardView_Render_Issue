package com.example.materialcardviewrenderissue

import android.os.Bundle
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment
import com.google.android.material.card.MaterialCardView
import com.google.android.material.shape.RoundedCornerTreatment
import com.google.android.material.shape.ShapeAppearanceModel
import com.google.android.material.shape.TriangleEdgeTreatment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardView = findViewById<MaterialCardView>(R.id.card_view)

        //This one also hides cardView content hidden
//        val edgeTreatment =
//            BottomAppBarTopEdgeTreatment(0f, 0f, 0f).apply {
//                fabDiameter = resources.getDimension(R.dimen.cutout_size)
//            }

        val edgeTreatment = TriangleEdgeTreatment(resources.getDimension(R.dimen.cutout_size), true)

        //Comment this line and cardView content would be shown
        cardView.shapeAppearanceModel = ShapeAppearanceModel.Builder()
            .setAllEdges(edgeTreatment)
            .build()
    }
}
