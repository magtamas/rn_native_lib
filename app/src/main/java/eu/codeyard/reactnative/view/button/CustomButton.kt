package eu.codeyard.reactnative.view.button

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import eu.codeyard.reactnative.R
import eu.codeyard.reactnative.databinding.CustomButtonBinding

class CustomButton @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null
) : FrameLayout(context, attributeSet) {

    private var binding = CustomButtonBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    init {
        View.inflate(context, R.layout.custom_button, this)
        setAttributes(attributeSet)
    }

    private fun setAttributes(attributeSet: AttributeSet?) {
        context.theme.obtainStyledAttributes(
            attributeSet,
            R.styleable.CustomButton,
            0, 0
        ).apply {
            try {

            } finally {
                setButtonColor(
                    getColor(
                        R.styleable.CustomButton_buttonColor,
                        ContextCompat.getColor(
                            context,
                            R.color.custom_button_color
                        )
                    )
                )
                setLabel(
                    label = getString(R.styleable.CustomButton_label),
                    color = getColor(
                        R.styleable.CustomButton_labelColor,
                        ContextCompat.getColor(
                            context,
                            R.color.custom_button_label_color
                        )
                    )
                )
                recycle()
            }
        }
    }

    private fun setButtonColor(color: Int) {
        binding.buttonRoot.setBackgroundColor(color)
    }

    private fun setLabel(
        label: String?,
        color: Int
    ) {
        binding.label.text = label
        binding.label.setTextColor(color)
    }
}