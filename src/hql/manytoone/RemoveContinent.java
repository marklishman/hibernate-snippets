session.beginTransaction();

        Continent oceania = (Continent) session.load(Continent.class, 6);
        session.delete(oceania);

        session.getTransaction().commit();