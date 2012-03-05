package com.izforge.izpack.compiler.container;

import com.izforge.izpack.installer.container.impl.GUIInstallerContainer;
import com.izforge.izpack.installer.container.impl.InstallerContainer;
import org.junit.runners.model.FrameworkMethod;
import org.picocontainer.MutablePicoContainer;

/**
 * Container for integration testing
 *
 * @author Anthonin Bonnefoy
 */
public class TestInstallationContainer extends AbstractTestInstallationContainer
{

    public TestInstallationContainer(Class klass, FrameworkMethod frameworkMethod)
    {
        super(klass, frameworkMethod);
    }

    @Override
    protected InstallerContainer createInstallerContainer()
    {
        return new GUIInstallerContainer();
    }

}
