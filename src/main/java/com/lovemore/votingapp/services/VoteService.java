/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lovemore.votingapp.services;

import java.util.List;

/**
 *
 * @author lovenalube
 */
public interface VoteService {
    
    public int totalVotes();
    
    public List<String> voters();
    
}
