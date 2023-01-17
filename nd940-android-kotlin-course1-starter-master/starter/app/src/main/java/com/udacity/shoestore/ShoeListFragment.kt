package com.udacity.shoestore

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.databinding.ViewBinding
import com.udacity.shoestore.models.Shoe
import kotlinx.android.synthetic.main.fragment_shoe_list.*
import kotlinx.android.synthetic.main.fragment_shoe_list.view.*
import java.util.zip.Inflater

class ShoeListFragment : Fragment() {


    private val viewModel: ShowViewModel by activityViewModels()

    private lateinit var binding: FragmentShoeListBinding
    lateinit var linearLayout: LinearLayout
    lateinit var shoe: Shoe

    private lateinit var shoeBinding: ViewBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       shoeBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.view, container, false)

        //shoeBinding =
          //  ViewBinding.inflate(layoutInflater)

        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)

        linearLayout = binding.lyner
       shoeBinding.viewModel = viewModel

       // binding.lyner.addView(shoeBinding.root)

        shoe = viewModel.buildShoe()
        viewModel.adddd(shoe)
        shoeBinding.shoe = shoe


       addView()

        binding.AddShoe.setOnClickListener {
            // addShoeToView(container, shoe)
            Navigation.findNavController(it)
                .navigate(R.id.action_shoeListFragment_to_addingShoeFragment)

        }


        // Toast.makeText(activity, "${args.size}", Toast.LENGTH_LONG).show()

        Toast.makeText(activity, "${viewModel.shoeName.value.toString()}", Toast.LENGTH_LONG)
            .show()

        return binding.root
    }


    fun addView() {

        linearLayout.addView(shoeBinding.root)

        // val inflatedView = View.inflate(context,R.layout.view, lyner)

      //  binding.lyner.addView(new.rootView)
       // binding.lyner.addView(shoeBinding.root)
        // shoeBinding.shoe= shoe

        // shoeBinding.shoe = shoe
    }


}


//  viewModel = ViewModelProvider(this).get(ShowViewModel::class.java)
/*viewModel.ShoeName.observe(viewLifecycleOwner, Observer {
 NewName -> binding.fffffffff.setText(NewName) })
*/
// var args = ShoeListFragmentArgs.fromBundle(arguments!!)
// var args = ShoeListFragmentArgs.fromBundle(arguments)
// var args = ShoeListFragmentArgs.fromBundle(arguments!!)
//  binding.fffffffff.text = viewModel.shoeName.value
//  Toast.makeText(activity,"${viewModel.ShoeName.value.toString()}", Toast.LENGTH_LONG).show()
//    binding.fffffffff.setText(viewModel.ShoeName.value.toString())

// private lateinit var viewModel: ShowViewModel
//  private val viewModel: ShowViewModel by activityViewModels()
/*private fun addShoeToView(
    container: ViewGroup?,
    shoe: Shoe
) {
    val shoeBinding: ViewBinding = DataBindingUtil.inflate(
        layoutInflater, R.layout.view, container, false
    )
    shoeBinding.shoey = shoe
    binding.FramLayoutContanier.addView(shoeBinding.root)

    binding.AddShoe.setOnClickListener {
        binding.AddShoe.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_shoeListFragment_to_addingShoeFragment)
        }
    }
}*/


//  var args = ShoeListFragmentArgs.fromBundle(requireArguments())

//viewModel.shoeName.value = args.name.toString()
// viewModel.shoeSize.value = args.size.toString()
//viewModel.shoeCompany.value = args.company.toString()
//viewModel.shoeDescription.value = args.description.toString()

/* val shoee = Shoe(
     args.name.toString(),
     args.size.toString(),
     args.company.toString(),
     args.description.toString()
 )*/