Country georgia = (Country) session.load(Country.class, 122);
        System.out.println(georgia.getName() + " is in " +
        georgia.getContinent().getName());