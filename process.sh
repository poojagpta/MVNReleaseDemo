//Jar file, config.yaml, certificate file,webd.conf

sudo cp /opt/web/webd.conf /etc/supervisor/conf.d/
sudo mkdir -p /var/log/ws/
sudo mkdir -p /var/log/webd/
sudo supervisorctl reread
sudo supervisorctl update
sudo supervisorctl status webd
sudo supervisorctl status webd | awk '{print $2}'
