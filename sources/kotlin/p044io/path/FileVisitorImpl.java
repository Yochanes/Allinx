package kotlin.p044io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlin/io/path/FileVisitorImpl;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "kotlin-stdlib-jdk7"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class FileVisitorImpl extends SimpleFileVisitor<Path> {
    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult postVisitDirectory(Object obj, IOException iOException) throws IOException {
        Path dir = (Path) obj;
        Intrinsics.m18599g(dir, "dir");
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory(dir, iOException);
        Intrinsics.m18598f(fileVisitResultPostVisitDirectory, "postVisitDirectory(...)");
        return fileVisitResultPostVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes attrs) throws IOException {
        Path dir = (Path) obj;
        Intrinsics.m18599g(dir, "dir");
        Intrinsics.m18599g(attrs, "attrs");
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        Intrinsics.m18598f(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes attrs) throws IOException {
        Path file = (Path) obj;
        Intrinsics.m18599g(file, "file");
        Intrinsics.m18599g(attrs, "attrs");
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        Intrinsics.m18598f(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final FileVisitResult visitFileFailed(Object obj, IOException exc) throws IOException {
        Path file = (Path) obj;
        Intrinsics.m18599g(file, "file");
        Intrinsics.m18599g(exc, "exc");
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed(file, exc);
        Intrinsics.m18598f(fileVisitResultVisitFileFailed, "visitFileFailed(...)");
        return fileVisitResultVisitFileFailed;
    }
}
