package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.RequestProcessor;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@OptIn
@RequiresApi
class RequestBuilder {

    /* JADX INFO: compiled from: Proguard */
    public static class RequestProcessorRequest implements RequestProcessor.Request {
        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public final Config getParameters() {
            return null;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public final List getTargetOutputConfigIds() {
            throw null;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public final int getTemplateId() {
            throw null;
        }
    }
}
