PACAKGE_MANAGER_INSTALL_CMD="apt-get install -y";

if ! [ -x "$(java --version)" ]; then
    # command taken from https://docs.scala-lang.org/getting-started/index.html
    curl -fL https://github.com/coursier/launchers/raw/master/cs-x86_64-pc-linux.gz | gzip -d > cs && chmod +x cs && ./cs setup
else
    echo "Java não disponivel."
    exit 1;
fi
