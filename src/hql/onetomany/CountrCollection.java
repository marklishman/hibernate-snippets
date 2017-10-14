Continent europe = (Continent) session.load(Continent.class, 3);

System.out.println(europe.getName() + " has " +
    europe.getCountries().size() +
    " countries which are");

for (Country country : europe.getCountries()) {
    System.out.println("  " + country.getName());
}