package br.com.igorbag.githubsearch.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import br.com.igorbag.githubsearch.R
import br.com.igorbag.githubsearch.domain.Repository

class RepositoryAdapter(
    private val repositories: List<Repository>,
    //    private val itemCarClickListener: (String) -> Unit,
    private val btnShareClickListener: (String) -> Unit
) : RecyclerView.Adapter<RepositoryAdapter.ViewHolder>() {

    // Cria uma nova view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.repository_item, parent, false)
        return ViewHolder(view)
    }

    // Pega o conteudo da view e troca pela informacao de item de uma lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //@TODO 8 -  Realizar o bind do viewHolder
        val repository = repositories[position]
        holder.repositoryTitle.text = repository.name
        holder.buttonShare.setOnClickListener { btnShareClickListener(repository.htmlUrl) }
//        holder.itemView.setOnClickListener { itemCarClickListener(repository.name) }
    }

    // Pega a quantidade de repositorios da lista
    //@TODO 9 - realizar a contagem da lista
    override fun getItemCount(): Int = repositories.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //@TODO 10 - Implementar o ViewHolder para os repositorios

        val repositoryTitle: TextView = view.findViewById(R.id.tv_preco)
        val buttonShare: View = view.findViewById(R.id.cl_card_content)

    }
}


