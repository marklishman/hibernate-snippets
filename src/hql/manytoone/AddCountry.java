session.beginTransaction();

        Country serbia = new Country();
        serbia.setName("Serbia");
        serbia.setArea(34116);

        Continent europe = (Continent) session.load(Continent.class, 3);
        europe.addCountry(serbia);
        session.save(serbia);

        session.getTransaction().commit();