# git 常用命令

## clone

git clone ***

git init

git status

git add ***

git commit -m "****"

git push

git pull

## 创建分支

git branch	查看本地分支

git branch -a 	查看远端的分支

git checkout -b branch1	在本地创建分支branch1

git checkout master	切换到master分支

## 删除分支

git branch -d branch1	第一步：删除本地分支branch1，-D 强制删除，一般不强制

git branch -r -d origin/branch1	第二步：删除远端分支branch1，此时远端页面上仍然有，还需要push

git push origin :branch1	第三步：删除远端分支branch1后，需要push一次

## 合并分支

git checkout -b test01	新建01 分支

git add test.txt

git commit -m "增加合并内容"

git push --set-upstream origin test01

git checkout master

git merge test01	将test01分支合并到当前分支上

git push	合并分支后，需要push一次

这里是test01分支上的内容。