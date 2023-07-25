#Env variables scope. Default 'User' (alternative 'Machine')
$envScope = 'User'
#Env variables to define <NAME> = '<value>'
$envHash = @{
    # DATABASE
    DB_HOST = 'localhost'
    DB_USERNAME = 'root'
    DB_PASSWORD = 'admin'
    DB_PORT = '5432'
    DB_NAME = 'basecodedb'
    DB_SCHEMA = 'basecode'
    DB_SSL_MODE = 'allow'
    # SERVER
    SERVER_PROFILES = 'develop'
}

foreach($env in $envHash.GetEnumerator()){
    [System.Environment]::SetEnvironmentVariables($env.Name, $env.Value, $envScope);
    Write-Host "$($env.Name) has been set!"
}

Write-Host "SETTING environment variables finished. Restart IDE."