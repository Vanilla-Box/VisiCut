Setting Up A Development Environment
====================================

To set up a development environment follow these steps:

1.  Download the Java SE Development kit, version 1.7 from <a href="http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html">Oracle</a>.
2.  Un-tar the file (e.g. "tar zxf jdk-7u51-linux-x64.tar.gz")
3.  Move the resulting directory to /opt, e.g. "sudo cp -Rp jdk1.7.0_51 /opt/"
4.  Download netbeans 7.0.1 from <a href="https://netbeans.org/community/releases/70/">here</a>
5.  Create a folder in /opt for netbeans: "sudo mkdir /opt/netbeans ; sudo chown $(whoami) /opt/netbeans"
6.  Install netbeans, telling it to use the 1.7 JDK installed previously during the install process, and to install into /opt/netbeans
7.  Install Batik (Java SVG library), and locate the batik-ext.jar.  I installed on Fedora by installing the "batik" package from the Fedora repositories, which installed batik-ext.jar to /usr/share/java/batik/batik-ext.jar.  On Debian / Ubuntu, the package is called libbatik-java and the jar file gets installed to /usr/share/java/batik-ext.jar
8.  When starting netbeans, tell it to use the Batik library by using this command:

    /opt/netbeans/bin/netbeans -cp:a /usr/share/java/batik/batik-ext.jar "$@"

9.  Clone the source with this command:

    git clone --recursive https://github.com/Vanilla-Box/VisiCut.git

10. In netbeans, Go to File -> Open Project and Navigate to .../VisiCut/lib and open the LibLaserCut project
11. Open Project and import .../VisiCut
12. Click the "run" button on the tool bar to build and run.  If the VisiCut app opens after a short delay, everything worked!

