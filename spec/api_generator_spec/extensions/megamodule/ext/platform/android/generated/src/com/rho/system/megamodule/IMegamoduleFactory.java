package com.rho.system.megamodule;

import com.rhomobile.rhodes.api.IRhoApiFactory;
import com.rhomobile.rhodes.api.IRhoApiSingletonFactory;

public interface IMegamoduleFactory
    extends IRhoApiFactory<IMegamodule>,
            IRhoApiSingletonFactory<IMegamoduleSingleton> {

    @Override
    IMegamoduleSingleton getApiSingleton();

    @Override
    Megamodule getApiObject(String id);

}