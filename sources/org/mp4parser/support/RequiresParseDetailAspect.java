package org.mp4parser.support;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.lang.annotation.Aspect;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Aspect
public class RequiresParseDetailAspect {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Throwable f59279a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ RequiresParseDetailAspect f59280b;

    static {
        try {
            f59280b = new RequiresParseDetailAspect();
        } catch (Throwable th) {
            f59279a = th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static RequiresParseDetailAspect m21845a() {
        String str;
        RequiresParseDetailAspect requiresParseDetailAspect = f59280b;
        if (requiresParseDetailAspect != null) {
            return requiresParseDetailAspect;
        }
        Throwable th = f59279a;
        if (th == null) {
            str = "org.mp4parser.support.RequiresParseDetailAspect";
        } else {
            str = "Exception while initializing org.mp4parser.support.RequiresParseDetailAspect: " + th;
        }
        NoAspectBoundException noAspectBoundException = new NoAspectBoundException(str);
        noAspectBoundException.f57990a = th;
        throw noAspectBoundException;
    }

    /* JADX INFO: renamed from: b */
    public static void m21846b(JoinPoint joinPoint) {
        if (joinPoint.mo21733a() instanceof AbstractBox) {
            ((AbstractBox) joinPoint.mo21733a()).getClass();
            return;
        }
        throw new RuntimeException("Only methods in subclasses of " + AbstractBox.class.getName() + " can  be annotated with ParseDetail");
    }
}
