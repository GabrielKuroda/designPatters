class Person
{
    public int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class PersonFactory
{
    private int id = 0;
    public Person createPerson(String name)
    {
        return new Person(id++,name);
    }

}

class FactoryDemo
{
    public static void main(String[] args)
    {
        PersonFactory personFactory = new PersonFactory();
        System.out.println(personFactory.createPerson("Gabriel").toString());
        System.out.println(personFactory.createPerson("Alberto").toString());

    }
}
