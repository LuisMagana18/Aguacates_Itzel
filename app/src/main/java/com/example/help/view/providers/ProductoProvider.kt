package com.example.help.view.providers

import com.example.help.models.Producto

class ProductoProvider {
    companion object{
        val frioLista = arrayListOf<Producto>(
            Producto("Super",250,"OA","Frio","Verde"),
            Producto("Extra",200,"MV","Frio","Maduro"),
            Producto("Tercera",35,"JE","Frio","Entrado"),
            Producto("Cuarta",5,"OA","Frio","Entrado"),
            Producto("Quinta",12,"MV","Frio","Verde"),
            Producto("Primera B",21,"Chicken","Frio","Maduro"),
            Producto("Segunda B",90,"AD","Frio","Verde"),
            Producto("Tercera Av",41,"IM","Frio","Entrado"),
            Producto("Canica",230,"AD","Frio","Maduro")
        )


        val pisoLista = arrayListOf<Producto>(
            Producto("Extra B",250,"OA","Piso","Verde"),
            Producto("Segunda B",20,"MV","Piso","Maduro"),
            Producto("Tercera Av",50,"JE","Piso","Entrado"),
            Producto("Primera Loca",5,"OA","Piso","Entrado"),
            Producto("Canica",152,"MV","Piso","Verde"),
            Producto("Extra",21,"Chicken","Piso","Maduro"),
            Producto("Segunda Loca",90,"AD","Piso","Verde"),
            Producto("Primera Av",41,"IM","Piso","Entrado"),
            Producto("Quinta",230,"AD","Piso","Maduro")
        )

        val crujiaLista = arrayListOf<Producto>(
            Producto("Tercera B",250,"OA","Crujia","Verde"),
            Producto("Cuarta Loca",20,"MV","Crujia","Maduro"),
            Producto("Tercera",50,"JE","Crujia","Entrado"),
            Producto("Primera",5,"OA","Crujia","Entrado"),
            Producto("Primera Av",152,"MV","Crujia","Verde"),
            Producto("Primera Loca",21,"Chicken","Crujia","Maduro"),
            Producto("Cuarta B",90,"AD","Crujia","Verde"),
            Producto("Tercera Av",41,"IM","Crujia","Entrado"),
            Producto("Super",230,"AD","Crujia","Maduro")
        )
    }
}