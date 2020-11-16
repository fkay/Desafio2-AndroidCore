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

        prato = Prato(
            "FILET MEDALLIONS",
            "Três suculentos medalhões de filé mignon, servidos com coberturas à sua escolha.",
            "http://tonyromas.com.br/wp-content/uploads/2018/06/steaks_filet_medallions.jpg"
        )
        pratos.add(prato)

        prato = Prato(
            "SIRLOIN",
            "Apetitoso corte de miolo de alcatra, macio e suculento. 300G",
            "http://tonyromas.com.br/wp-content/uploads/2018/06/steaks_sirloin.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "SHRIMP & SALMON PICCATA",
                "Suave filé de salmão grelhado ao molho aromático de camarões e alcaparras. Acompanha arroz pilaf e legumes no vapor.",
                "http://tonyromas.com.br/wp-content/uploads/2018/06/seafood_shrimp_salmon_picatta.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "GRILLED SALMON",
                "Filé de Salmão perfeitamente grelhado com duas opções de acompanhamento.",
                "http://tonyromas.com.br/wp-content/uploads/2018/06/seafood_grilled_salmon.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "TILÁPIA & TOMATO PESTO",
                "Filé de tilápia perfeitamente temperada e grelhada na manteiga servida com pesto de tomates frescos. Acompanha arroz pilaf e legumes no vapor.",
                "http://tonyromas.com.br/wp-content/uploads/2018/06/seafood_tilapia_tomato_pesto.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "MOJO GRILLED TILÁPIA WITH PINEAPPLE SALSA",
                "Tilápia grelhada com molho cítrico à base de laranja e um toque de mostarda, coberto com deliciosa salsa de abacaxi. Acompanha arroz pilaf e legumes no vapor.",
                "http://tonyromas.com.br/wp-content/uploads/2018/06/seafood_mojo_tilapia.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "MOJO CHICKEN",
                "Peito de frango grelhado com molho cítrico à base de laranja e um toque de mostarda, coberto com deliciosa salsa de abacaxi. Acompanha arroz pilaf e legumes no vapor.",
                "http://tonyromas.com.br/wp-content/uploads/2018/06/chicken_mojo_chicken.jpg"
        )
        pratos.add(prato)

        var restaurante = Restaurante(
            0,
            "Tony Roma's",
            "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            "22:00",
            "http://tonyromas.com.br/wp-content/uploads/2018/06/Tony_Romas_Ribs_home.jpg"
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

        prato = Prato(
                "Harumaki",
                "Rolinhos produzidos com massa fina e crocante, recheios queijo ou frango com vegetais.",
                "https://img.itdg.com.br/tdg/images/recipes/000/068/026/303167/303167_original.jpg?mode=crop&width=710&height=400"
        )
        pratos.add(prato)

        prato = Prato(
                "Camarão Empanado",
                "Camarões empanados em massa exclusiva.",
                "https://i0.wp.com/saudevidatotal.com/wp-content/uploads/2018/04/Camar%C3%A3o-Empanado..jpg?w=720&ssl=1"
        )
        pratos.add(prato)

        prato = Prato(
                "Niguiris Variados",
                "Sushi feito com uma fatia de peixe sobre o arroz.",
                "https://cdn.diferenca.com/imagens/niguiri-0-cke.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "Sashimis Variados",
                "Fatias de peixes e frutos do mar frescos.",
                "https://cdn.diferenca.com/imagens/sashimi-1-cke.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "Jyo Variados",
                "Bolinho de arroz, envolto por uma fatia de salmão, coberto com recheio picado.",
                "https://cdn.diferenca.com/imagens/sushi-joe.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "Uramaki Variados",
                "Arroz para o lado de fora enrolado em volta do recheio.",
                "https://cdn.diferenca.com/imagens/uramaki-cke.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "Hossomaki Variados",
                "Arroz e recheio envoltos em alga marinha.",
                "https://static-blog.getninjas.com.br/guia/wp-content/uploads/2014/08/hossomaki-misto-500x374-e1409345031925.jpg"
        )
        pratos.add(prato)

        restaurante = Restaurante(
            1,
            "Aoyama - Moema",
            "Alameda dos Arapanés, 532 - Moema",
            "00:00",
            "https://yata-apix-f2414b5e-b6d4-4865-88fc-6f44cc6f6494.lss.locawebcorp.com.br/78a22b9558c444428f6e289f37136a09.jpg",
            //pratos
        )

        restaurantes.add(restaurante)
        pratosList.add(pratos)

        pratos = PratoList()
        prato = Prato(
                "Royal Cheese Ribs",
                "Uma versão da nossa Ribs: desossada, recheada com mix de queijos, empanada de um jeito bem crocante e finalizada com molho de queijos e bacon.",
                "https://s3.amazonaws.com/institucional-statics-files/site/uploads/RoyalCheese_225x255.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "Junior Ribs",
                "Essa versão traz meia costela grelhada em chama aberta e temperada com blend de especiarias.",
                "https://s3.amazonaws.com/institucional-statics-files/site/uploads/JR-Ribs.png"
        )
        pratos.add(prato)

        prato = Prato(
                "Junior Ribs For Two",
                "Essas duas Junior Ribs servidas com dois acompanhamentos são perfeitas para quem está em dupla. Combine com um dos nossos molhos: Barbecue ou Billabong. Acrescente um acompanhamento extra por mais R\$ 10,90.",
                "https://s3.amazonaws.com/institucional-statics-files/site/uploads/Outback-Megaribs-225x255.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "Jackaroo Ribs And Steak",
                "Uma deliciosa combinação de Junior Ribs e nosso Jackaroo Steak com um toque de manteiga de limão. Para as ribs, você pode escolher entre os molhos Barbecue e Billabong. Acrescente um acompanhamento extra por mais R\$ 10,90.",
                "https://s3.amazonaws.com/institucional-statics-files/site/uploads/22_Jackaroo-Ribs-n-Steak-225x255.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "Ribs On The Barbie",
                "Preparada em chama aberta como manda a tradição australiana, nossa rib é marinada com um mix secreto de temperos e vem com as saborosas Cinnamon Apples.",
                "https://s3.amazonaws.com/institucional-statics-files/site/uploads/Ribs-On-The-Barbie.png"
        )
        pratos.add(prato)

        prato = Prato(
                "Alice Springs Chicken",
                "Esse suculento peito de frango grelhado e temperado com o molho Honey Mustard e coberto de bacon, champignons com mix de queijos gratinados.",
                "https://s3.amazonaws.com/institucional-statics-files/site/uploads/alice_springs_chicken-225x255.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "Steak Au Gratin",
                "Fatias de filet mignon e cogumelos salteados, molho de gorgonzola, nosso Garlic Mashed Potato e mix de queijos gratinados.",
                "https://s3.amazonaws.com/institucional-statics-files/site/uploads/steak_au_gratin-225x255.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "Firecracker Shrimp Burger",
                "Hambúrguer da casa no pão tipo brioche, camarões empanados envoltos no molho Firecracker, alface, maionese e cebolinha.",
                "https://s3.amazonaws.com/institucional-statics-files/site/uploads/225x255_Firecracker-Shrimp-Burger.png"
        )
        pratos.add(prato)

        prato = Prato(
                "Ribs Double Decker",
                "Burger com a nossa suculenta costela desfiada, caprichadas fatias de queijo tipo emmenthal e finalizado com molho Killer no pão tipo brioche.",
                "https://s3.amazonaws.com/institucional-statics-files/site/uploads/225x255_Ribs-Double-Decker.png"
        )
        pratos.add(prato)

//        prato = Prato(
//                "",
//                "",
//                ""
//        )
//        pratos.add(prato)

        restaurante = Restaurante(
                2,
            "Outback - Moema",
            "Av. Moaci, 187 - Moema, São Paulo",
            "00:00",
            "https://s3.amazonaws.com/institucional-statics-files/site/uploads/Ribs-On-The-Barbie.png",
            //pratos
        )

        restaurantes.add(restaurante)
        pratosList.add(pratos)

        pratos = PratoList()
        prato = Prato(
                "STREET TACOS",
                "Deliciosa alcatra black fatiada, envolta de tomates marinados para você montar 6 tacos à sua maneira. Acompanham nosso molho especial sour mex, cebola roxa marinada e tortillas gratinadas com queijo.",
                "https://sisenor.com.br/wp-content/uploads/2020/07/street.png"
        )
        pratos.add(prato)

        prato = Prato(
                "CHILLI COM CARNE",
                "Nossa famosa versão da tradicional receita texana de feijão temperados com carne, cobertos com queijo derretido e jalapeño. Acompanham nachos.",
                "https://sisenor.com.br/wp-content/uploads/2020/07/chillicomcarne.png"
        )
        pratos.add(prato)

        prato = Prato(
                "BURGER BITS",
                "6 deliciosos miniburgers grelhados, queijo cremoso, alface e cebola salteada no molho barbecue. Acompanha molho barbecue e onion crisps.",
                "https://sisenor.com.br/wp-content/uploads/2020/07/burger.png"
        )
        pratos.add(prato)

        prato = Prato(
                "CHILI FRIES",
                "Sensacional porção de batatas chips cobertas com bacon, sour cream, chili e queijo derretido. Acompanha molho barbecue e maionese.",
                "https://sisenor.com.br/wp-content/uploads/2020/07/fries.png"
        )
        pratos.add(prato)

        prato = Prato(
                "NACHOS GUACAMOLE",
                "Porção de nachos cobertos com queijo e servida com o nosso delicioso guacamole.",
                "https://sisenor.com.br/wp-content/uploads/2020/07/nachosguaca.png"
        )
        pratos.add(prato)

        prato = Prato(
                "QUESADILLAS APPETIZERS",
                "Nossa quesadilla tradicional de queijo servida em 8 DELICIOSAS FATIAS com onion crisps e jalapeños. Ideal para compartilhar. Acompanha molho sour-mex.",
                "https://sisenor.com.br/wp-content/uploads/2020/07/quesadilha-2.png"
        )
        pratos.add(prato)

        prato = Prato(
                "NACHOS SUPREME",
                "Nachos gratinados com queijo cobertos com frijoles, queijo, azeitonas, guacamole, sour cream, pico de gallo e salsa da casa.",
                "https://sisenor.com.br/wp-content/uploads/2020/03/nachos-supreme-1-1024x1024.jpg"
        )
        pratos.add(prato)

        prato = Prato(
                "TEQUILA CAMARONES",
                "Monte seus tacos de camarão no nosso molho de queijo servido em um tacho de ferro fumegante. Acompanham tortillas e tostadas, refrescante molho sour mex, cebola marinada e limão fatiado.",
                "https://sisenor.com.br/wp-content/uploads/2020/07/tequila.png"
        )
        pratos.add(prato)

        prato = Prato(
                "JALAPEÑO POPPERS",
                "8 bolinhos empanados de pimenta jalapeño e queijo cremoso. Acompanham molho barbecue e onion crisps.",
                "https://sisenor.com.br/wp-content/uploads/2020/07/jalapeno.png"
        )
        pratos.add(prato)

        prato = Prato(
                "QUESO CURADO",
                "Porção de queijo coalho em uma panela fumegante, com nossa deliciosa geleia da casa. Acompanham nachos e nosso molho sour mex.",
                "https://sisenor.com.br/wp-content/uploads/2020/07/queso.png"
        )
        pratos.add(prato)

        restaurante = Restaurante(
                3,
                "Sí Señor!",
                "Alameda Jauaperi, 626 - Moema",
                "01:00",
                "https://sisenor.com.br/wp-content/uploads/2020/07/nachossupreme.png",
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