read -p "git repo name: " repo;
urlA="https://github.com/marfrede/";
urlB=".git";
repo="$urlA$repo$urlB";
echo "git init;"
git init;
echo "git remote remove origin";
git remote remove origin;
echo "git remote add origin $repo";
git remote add origin $repo;
echo "git remote;"
git remote;
echo "git checkout -b main;"
git checkout -b main;
echo "git branch -d master;"
git branch -d master;
echo "git pull origin main;"
git pull origin main;
echo "git add .;"
git add .;
echo "git commit -m \"initial commit\";"
git commit -m "initial commit";
echo "git push -u origin main;"
git push -u origin main;
$SHELL;