package net.masterthought.dlanguage.run;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.ModuleRootManager;
import net.masterthought.dlanguage.DLanguageSdkType;
import org.jetbrains.annotations.NotNull;

public class DMDRunner {

    public boolean isValidModule(@NotNull final Module module) {
        final ModuleRootManager moduleRootManager = ModuleRootManager.getInstance(module);
        final Sdk sdk = moduleRootManager.getSdk();
        return sdk!=null && (sdk.getSdkType() instanceof DLanguageSdkType);
    }

//    public boolean ensureRunnerConfigured(@Nullable final Module module,
//                                          final RunProfile profile,
//                                          final Executor executor, final Project project) throws ExecutionException {
//        return false;  //To change body of implemented methods use File | Settings | File Templates.
//    }
}

