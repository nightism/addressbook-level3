package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public class StorageStub extends Storage{

    @Override
    public AddressBook load() throws StorageOperationException {
        // return dummy object
        return null;
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        // do nothing
        return;
    }

    @Override
    public String getPath() {
        // return dummy path
        return null;
    }

}
