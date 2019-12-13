package org.academiadecodigo.alphabeat.persistence.daos.mock;

import org.academiadecodigo.alphabeat.persistence.model.Sucker;
import org.springframework.stereotype.Repository;

@Repository
public class MockSuckerDao extends GenericDao<Sucker>{


    public MockSuckerDao() {
        super(Sucker.class);

        modelMap.put(1, createSucker(1, "Coiso", "Trambolho", "SuperCenas", "querias", "super@cenas.pt", 3));
    }


    public Sucker createSucker(Integer id, String firstName, String lastName, String userName, String password, String email, Integer numberOfRatings){
        Sucker sucker = new Sucker();

        sucker.setId(id);
        sucker.setFirstName(firstName);
        sucker.setLastName(lastName);
        sucker.setUserName(userName);
        sucker.setEmail(email);
        sucker.setPassword(password);
        sucker.setNumberOfRatings(numberOfRatings);

        return sucker;
    }
}
