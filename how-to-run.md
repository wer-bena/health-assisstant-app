 ## *** How to run the app ***

1. Download the ZIP file of project or clone the repository. To make sure the app is running properly, please downlowad or clone also the front-end repository, you can use the following link: https://github.com/wer-bena/health-assisstant-front .
2. Open the health-assistant-app project and configure access to the database by:
    - opening application.yml file and finding line 8;
    - replacing following placeholders: **'put_database_url_here'** with your own database url, **'put_port_here'** with relevant port, **'put_database_name_here'** with your database name, **'put_username_here'** with username and **'put_password_here'** with your own password;
    - running the application;
    - opening the health-assistant-front project and running it. It should aoutomatically connect with the backend already running on localhost:8080.
    - open your browser on the address provided by your IDE after running the front-end (in most cases it will be http://localhost:4200 ) .
3. Enjoy the app!
