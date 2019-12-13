package org.academiadecodigo.alphabeat.services.mock;

/**
 * Created by codecadet on 12/12/2019.
 */

import org.academiadecodigo.alphabeat.persistence.model.AbstractModel;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractMockService<T extends AbstractModel> {

    protected Map<Integer, T> modelMap = new HashMap<>();

    protected Integer getNextId() {
        return modelMap.isEmpty() ? 1 : Collections.max(modelMap.keySet()) + 1;
    }



}
