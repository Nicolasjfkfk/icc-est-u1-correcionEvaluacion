package models;


public class PersonasGenerator

{

    public Person[] generarPersonas() {
         String[] nombres = { "Ana", "Luis", "Carlos", "Maria", "Jose", "Pedro",
         "Lucia", "Miguel", "Rosa", "Fernando",
         "Sofia", "Javier", "Paula", "Alejandro", "Teresa", "Andres", "Raul",
         "Carmen", "Daniel",
         "Laura", "Gabriel", "Sara", "Francisco", "Patricia", "David", "Elena",
         "Manuel", "Isabel",
         "Jorge", "Cristina", "Juan", "Claudia", "Santiago", "Marcos", "Felipe",
         "Julia", "Victor",
         "Nuria", "Eduardo", "Monica", "Adrian", "Esteban", "Raquel", "Roberto",
         "Irene", "Ricardo",
         "Pilar", "Gonzalo", "Eva", "Pablo", "Angela" };
        Person[] personas = new Person[50];

        personas[0] = new Person("Laura", 27, 163);
        personas[1] = new Person("Patricia", 49, 178);
        personas[2] = new Person("David", 49, 169);
        personas[3] = new Person("Pablo", 55, 151);
        personas[4] = new Person("Victor", 65, 186);
        personas[5] = new Person("Ricardo", 62, 158);
        personas[6] = new Person("Roberto", 69, 185);
        personas[7] = new Person("Irene", 61, 150);
        personas[8] = new Person("Ricardo", 20, 158);
        personas[9] = new Person("Laura", 40, 199);
        personas[10] = new Person("Raul", 28, 150);
        personas[11] = new Person("Roberto", 75, 153);
        personas[12] = new Person("Ricardo", 39, 156);
        personas[13] = new Person("Gabriel", 54, 199);
        personas[14] = new Person("Miguel", 19, 195);
        personas[15] = new Person("Eva", 54, 150);
        personas[16] = new Person("Fernando", 74, 154);
        personas[17] = new Person("Fernando", 72, 175);
        personas[18] = new Person("Elena", 60, 171);
        personas[19] = new Person("Marcos", 44, 162);
        personas[20] = new Person("Andres", 57, 175);
        personas[21] = new Person("Manuel", 25, 194);
        personas[22] = new Person("Irene", 67, 167);
        personas[23] = new Person("Rosa", 21, 192);
        personas[24] = new Person("Elena", 33, 169);
        personas[25] = new Person("Maria", 46, 162);
        personas[26] = new Person("Paula", 48, 173);
        personas[27] = new Person("Teresa", 48, 156);
        personas[28] = new Person("Irene", 53, 199);
        personas[29] = new Person("Adrian", 55, 175);
        personas[30] = new Person("Jose", 78, 183);
        personas[31] = new Person("Eduardo", 21, 174);
        personas[32] = new Person("Victor", 24, 197);
        personas[33] = new Person("Gabriel", 50, 156);
        personas[34] = new Person("Sofia", 49, 165);
        personas[35] = new Person("Eva", 50, 160);
        personas[36] = new Person("Raul", 74, 164);
        personas[37] = new Person("Andres", 50, 176);
        personas[38] = new Person("Laura", 46, 188);
        personas[39] = new Person("Raquel", 74, 151);
        personas[40] = new Person("Francisco", 57, 167);
        personas[41] = new Person("Carmen", 63, 158);
        personas[42] = new Person("Carlos", 22, 179);
        personas[43] = new Person("Carmen", 33, 172);
        personas[44] = new Person("Lucia", 19, 180);
        personas[45] = new Person("Raquel", 34, 180);
        personas[46] = new Person("Angela", 77, 192);
        personas[47] = new Person("Elena", 59, 175);
        personas[48] = new Person("Francisco", 29, 183);
        personas[49] = new Person("Irene", 73, 161);

        return personas;
    }
}
