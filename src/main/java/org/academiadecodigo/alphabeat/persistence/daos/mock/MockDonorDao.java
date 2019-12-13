package org.academiadecodigo.alphabeat.persistence.daos.mock;

import org.academiadecodigo.alphabeat.persistence.daos.DonorDao;
import org.academiadecodigo.alphabeat.persistence.model.Donor;
import org.academiadecodigo.alphabeat.persistence.model.choices.BloodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MockDonorDao extends GenericDao<Donor> implements DonorDao{

    @Autowired
    public MockDonorDao() {
        super(Donor.class);

        modelMap.put(1, createDonor(1,"username","firstname", "lastname", 21, BloodType.A_POSITIVE, true, true,100,true, "sadboi@email.com"));





    }

    public Donor createDonor(Integer id, String username, String firstName, String lastName,
                               Integer age, BloodType bloodType, boolean isHivPositive, boolean
                               isDiabetic, Integer weight, boolean isAvailable, String email){

        Donor donor = new Donor();

        donor.setId(id);
        donor.setUserName(username);
        donor.setFirstName(firstName);
        donor.setLastName(lastName);
        donor.setAge(age);
        donor.setBloodType(bloodType);
        donor.setHivStatus(isHivPositive);
        donor.setDiabetesStatus(isDiabetic);
        donor.setWeight(weight);
        donor.setAvailability(isAvailable);
        donor.setEmail(email);

        return donor;
    }
}
