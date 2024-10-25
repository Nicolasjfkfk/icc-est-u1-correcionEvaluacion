import models.Person;

public class MetodosOrdenamientoBusqueda {

    public void sortByAgeWithSelection(Person[] people) {
        int n = people.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (people[j].getAge() < people[minIndex].getAge()) {
                    minIndex = j;
                }
            }
            Person temp = people[minIndex];
            people[minIndex] = people[i];
            people[i] = temp;
        }
    }

    public void sortByHeightWithSelection(Person[] people) {
        int n = people.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (people[j].getHeight() < people[minIndex].getHeight()) {
                    minIndex = j;
                }
            }
            Person temp = people[minIndex];
            people[minIndex] = people[i];
            people[i] = temp;
        }
    }

    public void sortByAgeWithInsertion(Person[] people) {
        int n = people.length;
        for (int i = 1; i < n; i++) {
            Person key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getAge() > key.getAge()) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = key;
        }
    }

    public void sortByHeightWithInsertion(Person[] people) {
        int n = people.length;
        for (int i = 1; i < n; i++) {
            Person key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getHeight() > key.getHeight()) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = key;
        }
    }

    public int searchBinaryByAge(Person[] people, int age) {
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (people[mid].getAge() == age) {
                return mid;
            }
            if (people[mid].getAge() < age) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }

    public int searchBinaryByHeight(Person[] people, int height) {
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (people[mid].getHeight() == height) {
                return mid;
            }
            if (people[mid].getHeight() < height) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }

   
    public void showPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
