package com.example.desafio2.model.home

import com.example.desafio2.model.Prato
import com.example.desafio2.model.PratoList
import com.example.desafio2.model.Restaurante

class HomeRepository {
    val restaurantes: ArrayList<Restaurante> = arrayListOf()
    val pratosList: ArrayList<PratoList> = arrayListOf()

    fun getRestaurants(): List<Restaurante> {
        return restaurantes
    }

    fun getDishes(restaurante: Int): PratoList {
        return pratosList[restaurante]
    }

    init {
        var pratos = PratoList()

        var prato = Prato(
            "THE ORIGINAL BABY BACK RIBS",
            "Nossa mundialmente premiada “Baby Back Ribs”, grelhada à perfeição, generosamente banhada com um de nossos exclusivos molhos BBQ® a sua escolha.",
            "http://tonyromas.com.br/wp-content/uploads/2018/06/ribs_original_baby_back_ribs-300x200.jpg"
        )
        pratos.add(prato)

        prato = Prato(
            "ST. LOUIS RIBS",
            "Deliciosa Ribs St Louis, marinada, grelhada e caramelizada com um de nossos exclusivos molhos BBQ® a sua escolha.",
            "http://tonyromas.com.br/wp-content/uploads/2018/06/ribs_st_louis_1-300x200.jpg"
        )
        pratos.add(prato)

        prato = Prato(
            "BABY BACK RIBS & FILET MEDALLIONS",
            "Dois deliciosos medalhões de filet mignon, perfeitamente grelhados e cobertos com nosso Cabernet Demi-glace, meia Baby Back grelhada e banhada com molho BBQ.",
            "http://tonyromas.com.br/wp-content/uploads/2018/06/ribs_baby_back_ribs_filet_medallions-300x200.jpg"
        )
        pratos.add(prato)

        var restaurante = Restaurante(
            0,
            "Tony Roma's",
            "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            "22:00",
            "http://tonyromas.com.br/wp-content/uploads/2018/06/Tony_Romas_Ribs_home.jpg\n",
            //pratos
        )

        restaurantes.add(restaurante)
        pratosList.add(pratos)

        pratos = PratoList()
        prato = Prato(
            "Shimeji & Shimeji com lula e camarão",
            "Cogumelos salteados com shoyu, manteiga, ajinomoto, saquê e cebolinha.",
            "http://2.bp.blogspot.com/-RiSeAYVmSdA/VPj_zzpT4FI/AAAAAAAAAtM/oQPJHvuihLA/s1600/Shimeji%2Bcom%2BLula.jpg"
        )
        pratos.add(prato)

        prato = Prato(
            "Aguedashi tofu",
            "Cubos de tofu empanados e fritos servidos com molho.",
            "https://img-global.cpcdn.com/recipes/38de6673d739d623/751x532cq70/agedashi-tofu-mushroom-sauce-recipe-main-photo.jpg"
        )
        pratos.add(prato)

        prato = Prato(
            "Torikatsuo",
            "Filé de frango empanado com farinha panko.",
            "https://devour.asia/wp-content/uploads/2020/05/chicken-katsu-1.jpg"
        )
        pratos.add(prato)

        restaurante = Restaurante(
            1,
            "Aoyama - Moema",
            "Alameda dos Arapanés, 532 - Moema",
            "00:00",
            "https://yata-apix-f2414b5e-b6d4-4865-88fc-6f44cc6f6494.lss.locawebcorp.com.br/78a22b9558c444428f6e289f37136a09.jpg\n",
            //pratos
        )

        restaurantes.add(restaurante)
        pratosList.add(pratos)
    }


}

//pratos = PratoList()
//prato = Prato(
//"",
//"",
//""
//)
//pratos.add(prato)
//
//prato = Prato(
//"",
//"",
//""
//)
//pratos.add(prato)
//
//prato = Prato(
//"",
//"",
//""
//)
//pratos.add(prato)
//
//restaurante = Restaurante(
//"",
//"",
//"",
//"",
//pratos
//)
//
//restaurantes.add(restaurante)