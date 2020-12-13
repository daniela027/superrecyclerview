          package mx.udg.cuvalles.superrecicler

import adapters.paisAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import modelos.Pais

class MainActivity : AppCompatActivity() {
    var miRecycler:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miRecycler= findViewById(R.id.miRecycler)
        val listaPaises = ArrayList<Pais>()

        listaPaises.add(Pais("Mexico", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fes.wikipedia.org%2Fwiki%2FArchivo%3ABandera_de_M%25C3%25A9xico_(1914-1920).svg&psig=AOvVaw37G3Ui9nA4o-L5W53HLE0j&ust=1605747128841000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNDbrLnwiu0CFQAAAAAdAAAAABAD"))
        listaPaises.add(Pais("Noruega ", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fes.wikipedia.org%2Fwiki%2FBandera_de_Noruega&psig=AOvVaw2u9C2FuUG2qNQivcig9dJE&ust=1607439268583000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCKjIqo-QvO0CFQAAAAAdAAAAABAD"))
        listaPaises.add(Pais("Venezuela", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fes.wikipedia.org%2Fwiki%2FBandera_de_Venezuela&psig=AOvVaw1wZrvXf71bT2RgRIi7ZkSp&ust=1607439345220000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCg2q6QvO0CFQAAAAAdAAAAABAD"))

        miRecycler!!.layoutManager = GridLayoutManager(this,1 )
        miRecycler!!.setHasFixedSize(true)
        miRecycler!!.adapter= paisAdapter(listaPaises,this)








    }
}