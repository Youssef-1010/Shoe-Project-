package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.udacity.shoestore.databinding.FragmentAddingShoeBinding
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.models.Shoe

class AddingShoeFragment : Fragment() {

    private val viewModel: ShowViewModel by activityViewModels()
    private lateinit var binding: FragmentAddingShoeBinding

    //  private lateinit var viewModel: ShowViewModel
    val x = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_adding_shoe, container, false)

        binding.viewModel = viewModel
        //   viewModel = ViewModelProvider(this).get(ShowViewModel::class.java)
        // viewModel = ViewModelProvider(this).get(ShowViewModel::class.java)


        // viewModel.shoeName.observe(viewLifecycleOwner, Observer { newname ->
        // viewModel.shoeName.value = binding.ShoeName.toString()
        // })

        binding.AddingShoeButton.setOnClickListener {

            /* viewModel.shoeName.value = binding.ShoeName.text.toString()
             viewModel.shoeSize.value = binding.ShoeName.text.toString()
             viewModel.shoeCompany.value = binding.ShoeName.text.toString()
             viewModel.shoeDescription.value = binding.ShoeDescription.text.toString()
 */



            Navigation.findNavController(it).navigate(
                AddingShoeFragmentDirections.actionAddingShoeFragmentToShoeListFragment()
            )
            // var k =  viewModel.shoeName.value.toString()

            // val shoe = viewModel.buildShoe()
            // viewModel.adddd(shoe)

            //viewModel.adddd(viewModel.buildShoe())
            // k = binding.ShoeName.text.toString()


            //viewModel.shoeName.value = "binding.ShoeName.toString()"
            //  Toast.makeText(activity, "${viewModel.shoeName.value.toString()}", Toast.LENGTH_SHORT).show()

            //  viewModel.addddd(binding.ShoeName.text.toString()).toString()
//k = viewModel.shoeName.value.toString()


        }
        return binding.root


    }


}


//  val shoe = detailviewModel.buildShoe()
//detailviewModel.addShoe(shoe)

//viewModel.ShoeName.value = binding.ShoeName.text.toString()

// viewModel.add(binding.ShoeName.text.toString())
//  Toast.makeText(activity,"${binding.ShoeName.text.toString()}",Toast.LENGTH_LONG).show()
//  Toast.makeText(activity,"${viewModel.ShoeName.value.toString()}",Toast.LENGTH_LONG).show()

//            Toast.makeText(activity,"${viewModel.ShoeName.value.toString()}",Toast.LENGTH_LONG).show()
//  Toast.makeText(activity,"${d}",Toast.LENGTH_LONG).show()

//  val shoe = viewModel.buildShoe()
//  viewModel.add(shoe)
// viewModel.shoeName.value = "hi"

//  var name_from = binding.ShoeName.text.toString()
// var name_from = "binding.ShoeName.text.toString()"
// var size_from = binding.ShoeSize.text.toString()
//var company_from = binding.shoeCompany.text.toString()
// var desciption_from = binding.ShoeDescription.text.toString()