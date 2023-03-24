package com.example.help.view.providers

import com.example.help.models.Cliente
import com.example.help.models.Proveedor

class PersonaProvider {
    companion object{
        val clienteLista = arrayListOf<Cliente>(
            Cliente("Octavio","Ciudad de México","Activo"),
            Cliente("Teresa","Central de Abasto","Activo"),
            Cliente("Javier","Central de Abasto","Deudor"),
            Cliente("Jose Luis","Toluca","Inactivo"),
            Cliente("El Paraiso","Estado de México","Activo"),
            Cliente("Wilson","Central de Abasto","Activo"),
            Cliente("Avelino","Central de Abasto","Deudor"),
            Cliente("Negro","Toluca","Inactivo"),
            Cliente("Juan","Morelia","Activo"),
            Cliente("David","Michoacan","Activo"),
            Cliente("Javier","Cancún","Deudor"),
            Cliente("Gilberto","Cozumel","Inactivo"),
            Cliente("Aimar","Hidalgo","Activo"),
            Cliente("Pedro","Valle de Bravo","Activo"),
            Cliente("Luis Carlos","Ciudad Victoria","Deudor"),
            Cliente("Belen","Cancún","Inactivo")
        )


        val proveedorLista = arrayListOf<Proveedor>(

            Proveedor("Eugenio","Morelia",2),
            Proveedor("Antonio","Michoacan",3),
            Proveedor("Miguel","Valle de Bravo",22),
            Proveedor("Bernardo","Toluca",4),
            Proveedor("Francisco","Michoacan",12),
            Proveedor("Asis","Hidalgo",8),
            Proveedor("Avelino","Hidalgo",9),
            Proveedor("Noe","Toluca",15),
            Proveedor("Omar","Michoacan",4),
            Proveedor("Pacheco","Morelia",1),
            Proveedor("Hugo","Michoacan",22),
            Proveedor("Julio","Toluca",9),
            Proveedor("Cesar","Valle de Bravo",5),
            Proveedor("Javier","Valle de Bravo",8),
            Proveedor("Pablo","Michoacan",23),
            Proveedor("Marcelo","Toluca",5)
        )
    }

}