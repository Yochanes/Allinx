package org.koin.core.instance;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.ParametersHolder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Lorg/koin/core/instance/InstanceFactory;", "T", "", "Lorg/koin/mp/Lockable;", "Companion", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class InstanceFactory<T> {

    /* JADX INFO: renamed from: a */
    public final BeanDefinition f58216a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lorg/koin/core/instance/InstanceFactory$Companion;", "", "", "ERROR_SEPARATOR", "Ljava/lang/String;", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public InstanceFactory(BeanDefinition beanDefinition) {
        this.f58216a = beanDefinition;
    }

    /* JADX INFO: renamed from: a */
    public Object mo21805a(InstanceContext instanceContext) throws InstanceCreationException {
        StringBuilder sb = new StringBuilder("| (+) '");
        BeanDefinition beanDefinition = this.f58216a;
        sb.append(beanDefinition);
        sb.append('\'');
        String string = sb.toString();
        Logger logger = instanceContext.f58213a;
        logger.m21806a(string);
        try {
            ParametersHolder parametersHolder = instanceContext.f58215c;
            if (parametersHolder == null) {
                parametersHolder = new ParametersHolder(3, null);
            }
            return beanDefinition.f58203c.invoke(instanceContext.f58214b, parametersHolder);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            Intrinsics.m18598f(stackTrace, "getStackTrace(...)");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Intrinsics.m18598f(className, "getClassName(...)");
                if (StringsKt.m20434j(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb2.append(CollectionsKt.m18409J(arrayList, "\n\t", null, null, null, 62));
            String msg = "* Instance creation error : could not create instance for '" + beanDefinition + "': " + sb2.toString();
            Intrinsics.m18599g(msg, "msg");
            logger.m21808d(Level.f58224d, msg);
            String msg2 = "Could not create instance for '" + beanDefinition + '\'';
            Intrinsics.m18599g(msg2, "msg");
            throw new InstanceCreationException(msg2, e);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo21804b(InstanceContext instanceContext);

    public final boolean equals(Object obj) {
        InstanceFactory instanceFactory = obj instanceof InstanceFactory ? (InstanceFactory) obj : null;
        return Intrinsics.m18594b(this.f58216a, instanceFactory != null ? instanceFactory.f58216a : null);
    }

    public final int hashCode() {
        return this.f58216a.hashCode();
    }
}
