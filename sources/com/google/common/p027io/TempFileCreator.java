package com.google.common.p027io;

import com.airbnb.lottie.utils.AbstractC2433a;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.StandardSystemProperty;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import io.intercom.android.sdk.models.Participant;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.UserPrincipal;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
abstract class TempFileCreator {
    static final TempFileCreator INSTANCE = pickSecureCreator();

    /* JADX INFO: compiled from: Proguard */
    public static final class JavaIoCreator extends TempFileCreator {
        private static final int TEMP_DIR_ATTEMPTS = 10000;

        private JavaIoCreator() {
            super(null);
        }

        @Override // com.google.common.p027io.TempFileCreator
        public File createTempDir() {
            File file = new File(StandardSystemProperty.JAVA_IO_TMPDIR.value());
            String str = System.currentTimeMillis() + "-";
            for (int i = 0; i < TEMP_DIR_ATTEMPTS; i++) {
                File file2 = new File(file, str + i);
                if (file2.mkdir()) {
                    return file2;
                }
            }
            throw new IllegalStateException(AbstractC0000a.m15l("Failed to create directory within 10000 attempts (tried ", str, "0 to ", str, "9999)"));
        }

        @Override // com.google.common.p027io.TempFileCreator
        public File createTempFile(String str) {
            return File.createTempFile(str, null, null);
        }

        public /* synthetic */ JavaIoCreator(C44621 c44621) {
            this();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @IgnoreJRERequirement
    public static final class JavaNioCreator extends TempFileCreator {
        private static final PermissionSupplier directoryPermissions;
        private static final PermissionSupplier filePermissions;

        /* JADX INFO: renamed from: com.google.common.io.TempFileCreator$JavaNioCreator$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C44631 implements FileAttribute<ImmutableList<AclEntry>> {
            final /* synthetic */ ImmutableList val$acl;

            public C44631(ImmutableList immutableList) {
                this.val$acl = immutableList;
            }

            @Override // java.nio.file.attribute.FileAttribute
            public String name() {
                return "acl:acl";
            }

            @Override // java.nio.file.attribute.FileAttribute
            public /* bridge */ /* synthetic */ ImmutableList<AclEntry> value() {
                return value();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.nio.file.attribute.FileAttribute
            public ImmutableList<AclEntry> value() {
                return this.val$acl;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @IgnoreJRERequirement
        public interface PermissionSupplier {
            FileAttribute<?> get();
        }

        static {
            Set setM15028x = AbstractC4465b.m15028x(AbstractC4465b.m15012h());
            if (setM15028x.contains("posix")) {
                filePermissions = new C4466c(0);
                directoryPermissions = new C4466c(1);
            } else if (setM15028x.contains("acl")) {
                PermissionSupplier permissionSupplierUserPermissions = userPermissions();
                directoryPermissions = permissionSupplierUserPermissions;
                filePermissions = permissionSupplierUserPermissions;
            } else {
                C4466c c4466c = new C4466c(2);
                directoryPermissions = c4466c;
                filePermissions = c4466c;
            }
        }

        private JavaNioCreator() {
            super(null);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ FileAttribute m14996a() {
            return lambda$static$1();
        }

        public static /* synthetic */ PermissionSupplier access$300() {
            return userPermissions();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ FileAttribute m14997b() {
            return lambda$static$0();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ FileAttribute m14998c(FileAttribute fileAttribute) {
            return lambda$userPermissions$3(fileAttribute);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ FileAttribute m14999d() {
            return lambda$static$2();
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ FileAttribute m15000e(IOException iOException) {
            return lambda$userPermissions$4(iOException);
        }

        private static String getUsername() {
            String strValue = StandardSystemProperty.USER_NAME.value();
            Objects.requireNonNull(strValue);
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("java.util.Optional");
                Method method = cls.getMethod("current", new Class[0]);
                Method method2 = cls.getMethod("info", new Class[0]);
                Object objInvoke = cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod(Participant.USER_TYPE, new Class[0]).invoke(method2.invoke(method.invoke(null, new Object[0]), new Object[0]), new Object[0]), strValue);
                Objects.requireNonNull(objInvoke);
                return (String) objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException unused) {
                return strValue;
            } catch (InvocationTargetException e) {
                Throwables.throwIfUnchecked(e.getCause());
                return strValue;
            }
        }

        private static /* synthetic */ FileAttribute lambda$static$0() {
            return AbstractC4465b.m15018n(AbstractC4465b.m15004D());
        }

        private static /* synthetic */ FileAttribute lambda$static$1() {
            return AbstractC4465b.m15018n(AbstractC4465b.m15027w());
        }

        private static /* synthetic */ FileAttribute lambda$static$2() throws IOException {
            throw new IOException("unrecognized FileSystem type " + AbstractC4465b.m15012h());
        }

        private static /* synthetic */ FileAttribute lambda$userPermissions$4(IOException iOException) throws IOException {
            throw new IOException("Could not find user", iOException);
        }

        private static PermissionSupplier userPermissions() {
            try {
                UserPrincipal userPrincipalM12769l = AbstractC2433a.m12769l(AbstractC2433a.m12770m(AbstractC4465b.m15012h()), getUsername());
                AclEntry.Builder builderM12764g = AbstractC2433a.m12764g();
                AbstractC2433a.m12768k();
                return new C4467d(new C44631(ImmutableList.m14825of(AbstractC2433a.m12767j(AbstractC4465b.m15016l(AbstractC4465b.m15015k(AbstractC2433a.m12766i(AbstractC2433a.m12765h(builderM12764g), userPrincipalM12769l), EnumSet.allOf(AbstractC2433a.m12762e())), new AclEntryFlag[]{AbstractC4465b.m15017m(), AbstractC4465b.m15002B()})))), 0);
            } catch (IOException e) {
                return new C4467d(e, 1);
            }
        }

        @Override // com.google.common.p027io.TempFileCreator
        public File createTempDir() {
            try {
                return AbstractC4465b.m15010f(AbstractC4465b.m15014j(AbstractC2433a.m12763f(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]), new FileAttribute[]{directoryPermissions.get()}));
            } catch (IOException e) {
                throw new IllegalStateException("Failed to create directory", e);
            }
        }

        @Override // com.google.common.p027io.TempFileCreator
        public File createTempFile(String str) {
            return AbstractC4465b.m15010f(AbstractC4465b.m15013i(AbstractC2433a.m12763f(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]), str, new FileAttribute[]{filePermissions.get()}));
        }

        public /* synthetic */ JavaNioCreator(C44621 c44621) {
            this();
        }

        private static /* synthetic */ FileAttribute lambda$userPermissions$3(FileAttribute fileAttribute) {
            return fileAttribute;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ThrowingCreator extends TempFileCreator {
        private static final String MESSAGE = "Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().";

        private ThrowingCreator() {
            super(null);
        }

        @Override // com.google.common.p027io.TempFileCreator
        public File createTempDir() {
            throw new IllegalStateException(MESSAGE);
        }

        @Override // com.google.common.p027io.TempFileCreator
        public File createTempFile(String str) throws IOException {
            throw new IOException(MESSAGE);
        }

        public /* synthetic */ ThrowingCreator(C44621 c44621) {
            this();
        }
    }

    public /* synthetic */ TempFileCreator(C44621 c44621) {
        this();
    }

    private static TempFileCreator pickSecureCreator() {
        try {
            try {
                Class.forName("java.nio.file.Path");
                return new JavaNioCreator(null);
            } catch (ClassNotFoundException unused) {
                return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue() ? new ThrowingCreator(null) : new JavaIoCreator(null);
            }
        } catch (ClassNotFoundException unused2) {
            return new ThrowingCreator(null);
        } catch (IllegalAccessException unused3) {
            return new ThrowingCreator(null);
        } catch (NoSuchFieldException unused4) {
            return new ThrowingCreator(null);
        }
    }

    @VisibleForTesting
    @IgnoreJRERequirement
    public static void testMakingUserPermissionsFromScratch() {
        JavaNioCreator.access$300().get();
    }

    public abstract File createTempDir();

    public abstract File createTempFile(String str);

    private TempFileCreator() {
    }
}
