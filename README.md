# spring-vault

Once vault is installed on windows machine, start the vault server in dev mode.

C:\>vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"

Once vault dev server is launched, execute the below command in another command propmt.

set VAULT_ADDR=http://127.0.0.1:8200

Execute the below command to create a secret.

C:\>vault kv put secret/mysecret db.username=test db.password=passwd