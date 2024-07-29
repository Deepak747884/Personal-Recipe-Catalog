package com.example.recipesuggestions

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment

class VegFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_veg, container, false)

        // Reference the spinner, button, and text views
        val spinner: Spinner = view.findViewById(R.id.spinner_veg)
        val button: Button = view.findViewById(R.id.button_show_recipe_veg)
        val titleTextView: TextView = view.findViewById(R.id.text_recipe_title_veg)
        val ingredientsTextView: TextView = view.findViewById(R.id.text_recipe_ingredients_veg)
        val directionsTextView: TextView = view.findViewById(R.id.text_recipe_directions_veg)

        // Set up the button click listener
        button.setOnClickListener {
            Log.d("VegFragment", "Button clicked")
            val selectedCategory = spinner.selectedItem?.toString()
            Log.d("VegFragment", "Selected category: $selectedCategory")
            when (selectedCategory) {
                "Main Course" -> {
                    Log.d("VegFragment", "Main Course selected")
                    titleTextView.text = "Shahi Paneer"
                    ingredientsTextView.text = "Ingredients:\n- Paneer\n- Cream\n- Tomatoes\n- Spices\n- Nuts"
                    directionsTextView.text = "Directions:\n1. Prepare gravy with tomatoes and nuts.\n2. Add paneer and cream.\n3. Cook until done."
                    Log.d("VegFragment", "Title: ${titleTextView.text}")
                    Log.d("VegFragment", "Ingredients: ${ingredientsTextView.text}")
                    Log.d("VegFragment", "Directions: ${directionsTextView.text}")
                }
                "Snack" -> {
                    Log.d("VegFragment", "Snack selected")
                    titleTextView.text = "Pasta"
                    ingredientsTextView.text = "Ingredients:\n- Pasta\n- Vegetables\n- Sauce\n- Cheese"
                    directionsTextView.text = "Directions:\n1. Cook pasta.\n2. Sauté vegetables.\n3. Add sauce and pasta.\n4. Sprinkle cheese."
                    Log.d("VegFragment", "Title: ${titleTextView.text}")
                    Log.d("VegFragment", "Ingredients: ${ingredientsTextView.text}")
                    Log.d("VegFragment", "Directions: ${directionsTextView.text}")
                }
                else -> {
                    Log.d("VegFragment", "Unknown category selected")
                }
            }
        }

        return view
    }
}
