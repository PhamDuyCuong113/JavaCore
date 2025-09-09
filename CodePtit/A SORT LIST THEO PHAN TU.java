intervals.sort(Comparator.comparingInt(a -> a[0])); // theo phan tu dau tien
intervals.sort(Comparator.comparingInt((int[] a) -> a[0]).reversed());// nguoc lai

//SORT DOI TUONG
class Student {
    String name;
    int age;
    Student(String n, int a) { name = n; age = a; }
}
List<Student> list = new ArrayList<>();
list.add(new Student("An", 20));
list.add(new Student("Bình", 18));
list.add(new Student("Cường", 22));

list.sort(Comparator.comparingInt(s -> s.age));