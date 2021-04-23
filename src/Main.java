public class Main {
    public static void main(String[] args) {
        //Instanciamos un objeto de tipo Cliente

        Cliente cliente = new Cliente();

        cliente.idCliente="9351886";
        cliente.nombre="Jeyson Wilfredo";
        cliente.primerApellido="Zuazo";
        cliente.segundoApellido="Mamani";

        //Instaciamos un objeto de tipo Billete

        Billete billete = new Billete();

        billete.idBillete =19;
        billete.precioTotal=400;
        billete.cliente=cliente;
        Ciudad oruro= new Ciudad();

        oruro.idCiudad=1236;
        oruro.nombre="oruro";
        billete.origen=oruro;

        Ciudad cochabamba= new Ciudad();
        cochabamba.idCiudad=1597;
        cochabamba.nombre="cochabamba";

        billete.destino=cochabamba;
        Categoria turista= new Categoria();
        turista.idCategoria=321654;
        turista.nombre="tuista";
        billete.categoria=turista;


        //Instaciamos un objeto de tipo Ciudad

        Ciudad ciudad = new Ciudad();

        ciudad.idCiudad=11;
        ciudad.nombre="Cochabamba";



        //Instaciamos un objeto de tipo Categoria

        Categoria categoria = new Categoria();

        categoria.idCategoria=315;
        categoria.nombre="Publica";

        //Instaciamos un objeto de tipo Vuelo

        Vuelo vuelo = new Vuelo();

        vuelo.codigoVuelo="cb-52";
        Billete billete1 = new Billete();
        billete1.idBillete=511;

        //Instaciamos un objeto de tipo Aeropuerto

        Aeropuerto aeropuerto = new Aeropuerto();

        aeropuerto.codigoAeropuerto="634154";
        aeropuerto.nombre="BOA";
        aeropuerto.ciudad=ciudad;

        //Instaciamos un objeto de tipo Aeropuerto

        Plaza plaza = new Plaza();

        plaza.idPlaza=4161;
        plaza.vuelo=vuelo;
        plaza.categoria=categoria;
        plaza.numeroPlazas=3154641;
        plaza.tarifa=4161;
    }
}
