package com.example.laboratorio_07.ui.movie.billboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio_07.R
import com.example.laboratorio_07.data.model.MovieModel
import com.example.laboratorio_07.data.movies
import com.example.laboratorio_07.ui.movie.billboard.recycleview.MovieAdapter
import com.example.laboratorio_07.databinding.FragmentBillBoardBinding
import com.example.laboratorio_07.ui.movie.viewmodel.MovieViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BillBoardFragment : Fragment() {

    private lateinit var buttonFragmentNewMovie: FloatingActionButton
    private lateinit var binding : FragmentBillBoardBinding

    private lateinit var adapter: MovieAdapter

    private val movieViewModel: MovieViewModel by activityViewModels<MovieViewModel> {
        MovieViewModel.Factory
    }

    private fun showSelectedItem(movie: MovieModel) {
        movieViewModel.setSelectMovie(movie)
        findNavController().navigate(R.id.action_billBoardFragment_to_movieFragment)
    }

    private fun displayMovies() {
        adapter.setData(movieViewModel.getMovies())
        adapter.notifyDataSetChanged()
    }

    private fun setRecyclerView(view : View) {
        binding.moviesRecycleView.layoutManager = LinearLayoutManager(view.context)

        adapter = MovieAdapter { selectedMovie ->
            showSelectedItem(selectedMovie)
        }

        binding.moviesRecycleView.adapter = adapter
        displayMovies()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = FragmentBillBoardBinding.inflate(inflater, container , false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()

        setRecyclerView(view)
    }

    private fun bind(){
        //cardViewFragmentStarWars = view?.findViewById(R.id.card_view_star_wars) as CardView
        buttonFragmentNewMovie = view?.findViewById(R.id.btn_link_new_movie) as FloatingActionButton
    }

    private fun listeners(){
        buttonFragmentNewMovie.setOnClickListener{
            it.findNavController().navigate(R.id.action_billBoardFragment_to_newMovieFragment)
        }

    }
}
