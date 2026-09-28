package ca.gbccomp3074.labex2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private var step = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textCounter = findViewById<TextView>(R.id.textCounter)
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        val buttonReset = findViewById<Button>(R.id.buttonReset)
        val buttonStep = findViewById<Button>(R.id.buttonStep)

        // Add button
        buttonAdd.setOnClickListener {
            counter += step
            textCounter.text = counter.toString()
        }

        // Subtract button
        buttonSubtract.setOnClickListener {
            counter -= step
            textCounter.text = counter.toString()
        }

        // Reset button
        buttonReset.setOnClickListener {
            counter = 0
            step = 1
            textCounter.text = counter.toString()
        }

        // Step button
        buttonStep.setOnClickListener {
            step = 2
        }
    }
}