/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lovemore.votingapp.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author lovenalube
 */
@Embeddable
public class Demographic implements Serializable{
    private String ethnicity;
    private String gender;

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
