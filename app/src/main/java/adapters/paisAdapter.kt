package adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import modelos.Pais
import mx.udg.cuvalles.superrecicler.R

class paisAdapter(paises:ArrayList<Pais>, contexto: Context):RecyclerView.Adapter<paisAdapter.ViewHolder>{
    var paises:ArrayList<Pais>?=null
    var contexto:Context?=null

    init{
        this.paises=paises
        this.contexto=contexto

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vistaPais:View= LayoutInflater.from(contexto).inflate(R.layout.pais__item, parent,false)
        val paisViewHolder=ViewHolder(vistaPais)
        vistaPais.tag=paisViewHolder
        return paisViewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pais = paises!![position]
        holder.tvNombre!!.text=paises!![position].nombre

        Picasso.get().load(pais.imagen).placeholder(R.drawable.ic_launcher_background).into(holder.imFondo) //espera que cargue
        
    }

    override fun getItemCount(): Int {
        return this.paises!!.count()
    }


    class ViewHolder(vista:View): RecyclerView.ViewHolder(vista) {
        var imFondo: ImageView? = null
        var tvNombre: TextView? = null

        init {
            imFondo = vista.findViewById(R.id.imFondo)
            tvNombre = vista.findViewById(R.id.tvNombre)
        }



    }
}