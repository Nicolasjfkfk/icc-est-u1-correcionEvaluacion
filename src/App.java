import models.Carro;
import models.CarrosGenerator;
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {

        // Generar carros y ordenarlos
        CarrosGenerator carroGenerator = new CarrosGenerator();
        Carro[] carros = carroGenerator.generarCarros();

        System.out.println("Listado de carros generados:");
        MetodosOrdenamientoBusquedaB metodosCarros = new MetodosOrdenamientoBusquedaB();

        // Ordenar de forma ascendente por año antes de la búsqueda
        metodosCarros.sortBYearWithBubbleAvnAsendente(carros);
        metodosCarros.showCars(carros);

        int yearBuscado = 200;
        int posicionCarro = metodosCarros.searchBinaryByYear(carros, yearBuscado);
        if (posicionCarro == -1) {
            System.out.println("No se encontró el carro con el año " + yearBuscado);
        } else {
            System.out.println("El carro se encuentra en la posición: " + posicionCarro);
        }

        // Generar personas y ordenar por edad
        PersonasGenerator personaGenerator = new PersonasGenerator();
        Person[] personas = personaGenerator.generarPersonas();

        System.out.println("\nListado de personas generadas:");
        for (Person person : personas) {
            System.out.println(person);
        }

        MetodosOrdenamientoBusqueda mOB = new MetodosOrdenamientoBusqueda();
        mOB.sortByAgeWithInsertion(personas);
        mOB.showPeople(personas);

        int edadBuscada = 18;
        int result = mOB.searchBinaryByAge(personas, edadBuscada);

        if (result == -1) {
            System.out.println("No se encontró ninguna persona con " + edadBuscada + " años.");
        } else {
            System.out.println("Persona encontrada en la posición: " + result);
            System.out.println("Persona encontrada: " + personas[result]);
        }
    }
}
