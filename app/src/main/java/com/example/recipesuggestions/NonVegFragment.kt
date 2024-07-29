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

class NonVegFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_nonveg, container, false)

        // Reference the spinner, button, and text views
        val spinner: Spinner = view.findViewById(R.id.spinner_nonveg)
        val button: Button = view.findViewById(R.id.button_show_recipe)
        val titleTextView: TextView = view.findViewById(R.id.text_recipe_title)
        val ingredientsTextView: TextView = view.findViewById(R.id.text_recipe_ingredients)
        val directionsTextView: TextView = view.findViewById(R.id.text_recipe_directions)

        // Set up the button click listener
        button.setOnClickListener {
            Log.d("NonVegFragment", "Button clicked")
            val selectedCategory = spinner.selectedItem?.toString()
            Log.d("NonVegFragment", "Selected category: $selectedCategory")
            when (selectedCategory) {
                "Main Course" -> {
                    Log.d("NonVegFragment", "Main Course selected")
                    titleTextView.text = "Butter Chicken"
                    ingredientsTextView.text = "Ingredients:\n- Chicken\n- Butter\n- Tomatoes\n- Cream\n- Spices"
                    directionsTextView.text = "Directions:\n1. Marinate chicken.\n2. Cook in butter sauce.\n3. Add tomatoes and cream.\n4. Simmer until cooked."
                    Log.d("NonVegFragment", "Title: ${titleTextView.text}")
                    Log.d("NonVegFragment", "Ingredients: ${ingredientsTextView.text}")
                    Log.d("NonVegFragment", "Directions: ${directionsTextView.text}")
                }
                "Snack" -> {
                    Log.d("NonVegFragment", "Snack selected")
                    titleTextView.text = "Chili Chicken"
                    ingredientsTextView.text = "Ingredients:\n- Chicken\n- Bell Peppers\n- Chilies\n- Sauce"
                    directionsTextView.text = "Directions:\n1. Marinate chicken.\n2. Fry chicken and vegetables.\n3. Add sauce and simmer."
                    Log.d("NonVegFragment", "Title: ${titleTextView.text}")
                    Log.d("NonVegFragment", "Ingredients: ${ingredientsTextView.text}")
                    Log.d("NonVegFragment", "Directions: ${directionsTextView.text}")
                }
                else -> {
                    Log.d("NonVegFragment", "Unknown category selected")
                }
            }
        }

        return view
    }
}
