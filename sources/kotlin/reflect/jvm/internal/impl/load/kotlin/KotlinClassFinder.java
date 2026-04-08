package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface KotlinClassFinder extends KotlinMetadataFinder {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Result {

        /* JADX INFO: compiled from: Proguard */
        public static final class ClassFileContent extends Result {
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class KotlinClass extends Result {

            /* JADX INFO: renamed from: a */
            public final ReflectKotlinClass f53269a;

            public KotlinClass(ReflectKotlinClass reflectKotlinClass) {
                this.f53269a = reflectKotlinClass;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    Result.KotlinClass mo19110a(ClassId classId, JvmMetadataVersion jvmMetadataVersion);
}
