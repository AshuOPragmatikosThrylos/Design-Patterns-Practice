package Interfaces;

import src.ReusableObject;

public interface ObjectPool {
    ReusableObject borrowObject();
    
    void returnObject(ReusableObject object);
}
