Setting Up A Development Environment
====================================

To set up a development environment follow these steps:

1.  Download the Java SE Development kit, version 1.7 from <a href="http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html">Oracle</a>.
2.  Un-tar the file (e.g. "tar zxf jdk-7u51-linux-x64.tar.gz")
3.  Move the resulting directory to /opt, e.g. "sudo cp -Rp jdk1.7.0_51 /opt/"
4.  Download netbeans 8.1 SE from <a href="https://netbeans.org/downloads/">the Netbeans website</a>
5.  Create a folder in /opt for netbeans: "sudo mkdir /opt/netbeans ; sudo chown $(whoami) /opt/netbeans"
6.  Install netbeans, telling it to use the 1.7 JDK installed previously during the install process, and to install into /opt/netbeans
7.  Install Batik (Java SVG library).  
    -   On Fedora / Redhat, install the package "batik" package from the repositories. Locate "batik-ext.jar", using the command "rpm -ql batic |grep batik-ext.jar" (probably /usr/share/java/batik/batik-ext.jar
    -   On Debian / Ubuntu, install the package "libbatik-java", and locate batik-ext.jar using the command "dpkg --listfiles libbatik-java |grep batik-ext.jar" (probably /usr/share/java/batik-ext.jar)
8.  When starting netbeans, tell it to use the Batik library by using this command:

    /opt/netbeans/bin/netbeans -cp:a /usr/share/java/batik/batik-ext.jar

9.  Download the Swing plugin for netbeans from <a href="http://plugins.netbeans.org/plugin/43853/swing-application-framework-support">this webpage</a>.
10. In netbeans, install the plugin: Tools [menu] -> Plugins -> Downloaded [tab] -> Add plugins... [button] -> Select downloaded plugin file -> Select the plugin -> Install [button]
11.  Clone the source with this command:

    git clone --recursive https://github.com/Vanilla-Box/VisiCut.git

12. In netbeans, Go to File -> Open Project and navigate to .../VisiCut/lib and open the LibLaserCut project
13. Now open the VisiCut project by doing: File -> Open Project and navigate to .../VisiCut
14. Click the "run" button on the tool bar to build and run.  If the VisiCut app opens after a short delay, everything worked!

