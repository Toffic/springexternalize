/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incredible.service.basic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pro
 */
@Service
public class BinarySearchImpl {
    @Autowired
    private SortingAlgo sortingAlgo;

    public int binarySearch(int[] theArray, int theNumber) {

        int[] afterSort = Arrays.copyOf(sortingAlgo.sort(theArray), theArray.length);

        int indexOfNumber = 0;

        for (int i = 0; i < afterSort.length; i++) {
            if (theNumber == theArray[i]) {
                indexOfNumber = i;
                break;

            }
        }

        return indexOfNumber;
    }


}
